/*
 * Copyright 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.work.impl.utils.taskexecutor;

import androidx.annotation.RestrictTo;

import java.util.concurrent.Executor;

/**
 * Interface for executing common tasks in WorkManager.
 * @hide
 */

@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
public interface TaskExecutor {

    /**
     * @param runnable {@link Runnable} to post to the main thread
     */
    void postToMainThread(Runnable runnable);

    /**
     * @return The {@link Executor} for main thread task processing
     */
    Executor getMainThreadExecutor();

    /**
     * @param runnable {@link Runnable} to execute on a background thread pool
     */
    void executeOnBackgroundThread(Runnable runnable);

    /**
     * @return The {@link Executor} for background task processing
     */
    Executor getBackgroundExecutor();
}
