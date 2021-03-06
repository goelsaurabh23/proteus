/*
 * Apache License
 * Version 2.0, January 2004
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * TERMS AND CONDITIONS FOR USE, REPRODUCTION, AND DISTRIBUTION
 *
 * Copyright (c) 2017 Flipkart Internet Pvt. Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.flipkart.android.proteus;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.flipkart.android.proteus.value.Layout;
import com.flipkart.android.proteus.value.ObjectValue;

/**
 *
 */
public interface ProteusView {

    Manager getViewManager();

    void setViewManager(Manager manager);

    View getAsView();

    /**
     * Manager
     *
     * @author aditya.sharat
     */
    interface Manager {

        /**
         * Update the {@link View} with new data.
         *
         * @param data New data for the view
         */
        void update(@Nullable ObjectValue data);

        /**
         * @return
         */
        @NonNull
        ProteusContext getContext();

        /**
         * @return
         */
        @NonNull
        Layout getLayout();

        /**
         * @return
         */
        @NonNull
        DataContext getDataContext();

        /**
         * @param id
         * @return
         */
        @Nullable
        View findViewById(@NonNull String id);

    }
}
