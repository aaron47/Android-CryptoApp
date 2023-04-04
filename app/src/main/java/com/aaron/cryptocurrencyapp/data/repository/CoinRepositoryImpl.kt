package com.aaron.cryptocurrencyapp.data.repository

import com.aaron.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.aaron.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins() = api.getCoins()

    override suspend fun getCoinById(coinId: String) = api.getCoinById(coinId)

}