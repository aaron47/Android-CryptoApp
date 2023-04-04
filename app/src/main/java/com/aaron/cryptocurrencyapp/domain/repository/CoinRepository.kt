package com.aaron.cryptocurrencyapp.domain.repository

import com.aaron.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.aaron.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}