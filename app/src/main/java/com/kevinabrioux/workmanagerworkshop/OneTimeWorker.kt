package com.kevinabrioux.workmanagerworkshop

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters

class OneTimeWorker(context: Context, workerParams: WorkerParameters) : CoroutineWorker(context, workerParams) {
    override suspend fun doWork(): Result {
        Log.d("===>>>", "doWork")
        return Result.success()
    }
}