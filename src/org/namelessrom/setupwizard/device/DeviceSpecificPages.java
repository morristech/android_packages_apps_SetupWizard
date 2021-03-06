/*
 * <!--
 *    Copyright (C) 2015 The NamelessRom Project
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 * -->
 */

package org.namelessrom.setupwizard.device;

import android.annotation.NonNull;
import android.content.Context;

import com.cyanogenmod.setupwizard.setup.Page;
import com.cyanogenmod.setupwizard.setup.SetupDataCallbacks;

import java.util.ArrayList;

/**
 * Used to display device specific pages.
 * <p/>
 * To use, set <b>BOARD_SETUP_WIZARD_CLASS</b> to the path to your sources
 * and set <b>BOARD_SETUP_WIZARD_RESOURCES</b> to the path to your resources.
 * <p/>
 * Example:
 * <p/>
 * <i>BOARD_SETUP_WIZARD_CLASS := device/sample/setupwizard/src</i>
 * <p/>
 * <i>BOARD_SETUP_WIZARD_RESOURCES := device/sample/setupwizard/res</i>
 */
public class DeviceSpecificPages {
    private final ArrayList<Page> mPages;

    /**
     * You should initialize your custom pages here.
     */
    public DeviceSpecificPages(Context context, SetupDataCallbacks callbacks) {
        // size should be the number of pages you are adding
        mPages = new ArrayList<>(0);

        // you should add your pages here now
        // mPages.add(new YourCustomPage(context, callbacks));
    }

    /**
     * @return Device specific pages, if not implemented a empty list with size 0
     */
    @NonNull public ArrayList<Page> getPages() {
        return mPages;
    }
}
