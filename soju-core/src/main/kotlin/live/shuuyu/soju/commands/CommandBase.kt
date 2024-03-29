/*
 * Champagne
 * Copyright (C) 2022 Shuuyu
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package live.shuuyu.soju.commands

/**
 * Base command for commands that require many functions.
 * Includes base name, aliases, and executed functions.
 *
 * @since 0.1-SNAPSHOT
 * @author yujin
 */
abstract class CommandBase(
    val name: String,
    open val alias: List<String>? = null,
    val description: String? = "No description provided on what this does.",
    ) {
    /**
     * Aliases to the current command of which
     * execute the same function as the main command.
     *
     * @since 0.1-SNAPSHOT
     * @author yujin
     */
    final fun alias(
        name: String
    ): List<String>? = null

    /**
     * Sets up a sub command that can be executed.
     *
     * @since 0.1-SNAPSHOT
     * @author yujin
     */

}