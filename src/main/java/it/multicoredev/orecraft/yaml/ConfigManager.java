package it.multicoredev.orecraft.yaml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

/**
 * Copyright © 2019 by Lorenzo Magni and Michele Giacalone
 * This file is part of MCLib.
 * MCLib is under "The 3-Clause BSD License", you can find a copy <a href="https://opensource.org/licenses/BSD-3-Clause">here</a>.
 * <p>
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following
 * disclaimer in the documentation and/or other materials provided with the distribution.
 * 3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products
 * derived from this software without specific prior written permission.
 * <p>
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING,
 * BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY,
 * OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA,
 * OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */
public class ConfigManager {
    /**
     * Creates the config file from the default model in the jar.
     *
     * @param file  the destination file
     * @param input the input stream of your default model.
     * @throws IOException IOException if config creation fails
     */
    public void createConfig(File file, InputStream input) throws IOException {
        Files.copy(input, file.toPath());
    }

    /**
     * Loads the config file from disk.
     *
     * @param file the file you want to load
     * @return the {@link Configuration}
     * @throws IOException IOException if config loading fails
     */
    public Configuration loadConfig(File file) throws IOException {
        return ConfigurationProvider.getProvider(YamlConfiguration.class).load(file);
    }

    /**
     * Saves the config to file.
     *
     * @param config the {@link Configuration} you want to save
     * @param file   the destination file
     * @throws IOException IOException if config saving fails
     */
    public void saveConfig(Configuration config, File file) throws IOException {
        ConfigurationProvider.getProvider(YamlConfiguration.class).save(config, file);
    }

    /**
     * Loads the config from disk, creates the config if missing.
     *
     * @param stream the input stream of your default model
     * @param file   the destination file
     * @return the {@link Configuration}
     * @throws IOException IOException if the config creation or loading fails
     */
    public Configuration autoloadConfig(InputStream stream, File file) throws IOException {
        createConfig(file, stream);
        return loadConfig(file);
    }
}
