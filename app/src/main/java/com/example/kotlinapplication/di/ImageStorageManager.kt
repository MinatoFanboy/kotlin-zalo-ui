package com.example.kotlinapplication.di

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.util.Log
import androidx.annotation.WorkerThread
import coil.ImageLoader
import coil.request.ImageRequest
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File
import java.util.UUID
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ImageStorageManager @Inject constructor(@ApplicationContext private val context: Context) {
    companion object {
        private const val ROOT_FOLDER = "za"
        const val IMAGES = "images"
    }

    /** Root Folder */
    private fun getRootFolder(): File {
        val root = File(
            context.filesDir,
            ROOT_FOLDER
        )

        if (!root.exists()) {
            root.mkdirs()
        }

        return root
    }

    /** Create sub folder */
    fun getFolder(folderName: String): File {
        val folder = File(
            getRootFolder(),
            folderName
        )

        if (!folder.exists()) {
            folder.mkdirs()
        }

        return folder
    }

    @WorkerThread
    suspend fun downloadAndSaveImage(imageUrl: String, folderName: String = IMAGES, fileName: String = UUID.randomUUID().toString()): String? {
        return withContext(Dispatchers.IO) {
            try {
                val loader = ImageLoader(context)

                val request = ImageRequest.Builder(context)
                    .data(imageUrl)
                    .allowHardware(false)
                    .build()

                val result = loader.execute(request)

                val drawable =
                    result.drawable as? BitmapDrawable
                        ?: return@withContext null

                val folder = getFolder(folderName)

                val file = File(
                    folder,
                    "$fileName.jpg"
                )

                file.outputStream().use { output ->
                    drawable.bitmap.compress(
                        Bitmap.CompressFormat.JPEG,
                        90,
                        output
                    )
                }

                file.absolutePath
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }
    }

    suspend fun saveBitmap(bitmap: Bitmap, folderName: String = IMAGES, fileName: String = UUID.randomUUID().toString()): String? {
        return withContext(Dispatchers.IO) {
            try {
                val folder = getFolder(folderName)

                val file = File(
                    folder,
                    "$fileName.jpg"
                )

                file.outputStream().use { output ->

                    bitmap.compress(
                        Bitmap.CompressFormat.JPEG,
                        90,
                        output
                    )
                }

                file.absolutePath
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }
    }

    suspend fun deleteImage(imagePath: String?): Boolean {
        return withContext(Dispatchers.IO) {
            try {
                if (imagePath.isNullOrEmpty()) {
                    return@withContext false
                }

                val file = File(imagePath)

                if (file.exists()) {
                    file.delete()
                } else {
                    false
                }
            } catch (e: Exception) {
                false
            }
        }
    }

    suspend fun clearFolder(folderName: String) {
        withContext(Dispatchers.IO) {
            val folder = getFolder(folderName)

            folder.listFiles()?.forEach {
                it.delete()
            }
        }
    }

    fun isFileExists(path: String?): Boolean {
        if (path.isNullOrEmpty()) {
            return false
        }

        return File(path).exists()
    }
}