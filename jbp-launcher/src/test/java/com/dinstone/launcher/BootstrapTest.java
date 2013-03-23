/*
 * Copyright (C) 2012~2013 dinstone<dinstone@163.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dinstone.launcher;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BootstrapTest {

    @Before
    public void setUp() throws Exception {
        // System.setProperty("lifecycle.enabled", "true");
        //
        // System.clearProperty("launcher.config");
        // System.clearProperty("application.home");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testMain02() throws Exception {
        // -Dlauncher.config=file:src/test/resources/config/launcher.properties
        System.setProperty("launcher.config", "file:src/test/resources/config/launcher.properties");
        Bootstrap bs = new Bootstrap();
        bs.start();
    }

    @Test
    public void testMain03() throws Exception {
        // -Dapplication.home=src/test/resources/
        System.setProperty("application.home", "src/test/resources/");
        Bootstrap bs = new Bootstrap();
        bs.start();
    }

}
