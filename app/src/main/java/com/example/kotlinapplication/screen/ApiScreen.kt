package com.example.kotlinapplication.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.kotlinapplication.di.CustomViewModel
import com.example.kotlinapplication.ui.theme.LocalZaColors

@Composable
fun ApiScreen(viewModel: CustomViewModel = hiltViewModel()) {
    LaunchedEffect(Unit) {
        viewModel.observeTodos()
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(LocalZaColors.current.pageBackground3)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp),
        contentPadding = PaddingValues(bottom = 16.dp)
    ) {
        item {
            val res = viewModel.state.value
            when {
                res.isLoading -> {
                    Text("Loading")
                }

                res.error.isNotEmpty() -> {
                    Text(text = res.error)
                }

                res.todos.isNotEmpty() -> {
                    res.todos.forEach { item ->
                        Text(text = item.title)
                    }
                }
            }
        }
    }
}