/*
 * Clover - 4chan browser https://github.com/Floens/Clover/
 * Copyright (C) 2014  Floens
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.floens.chan.core.model;

import java.util.List;

public class Archive {
    public final List<ArchiveItem> items;

    public static Archive fromItems(List<ArchiveItem> items) {
        return new Archive(items);
    }

    private Archive(List<ArchiveItem> items) {
        this.items = items;
    }

    public static class ArchiveItem {
        public final String description;

        public final int id;

        public static ArchiveItem fromDescriptionId(String description, int id) {
            return new ArchiveItem(description, id);
        }

        private ArchiveItem(String description, int id) {
            this.description = description;
            this.id = id;
        }
    }
}
