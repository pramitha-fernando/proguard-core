/*
 * ProGuard -- shrinking, optimization, obfuscation, and preverification
 *             of Java bytecode.
 *
 * Copyright (c) 2002-2020 Guardsquare NV
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package proguard.dexfile.writer;

import java.util.ArrayList;
import java.util.List;


/**
 * This class represents a class path, as a list of ClassPathEntry objects.
 *
 * @author Eric Lafortune
 */
public class ClassPath
{
    private final List<ClassPathEntry> classPathEntries = new ArrayList<>();


    /**
     * Returns whether the class path contains any output entries.
     */
    public boolean hasOutput()
    {
        for (ClassPathEntry classPathEntry : classPathEntries) {
            if (classPathEntry.isOutput()) {
                return true;
            }
        }

        return false;
    }


    // Delegates to List.

    public void clear()
    {
        classPathEntries.clear();
    }

    public void add(int index, ClassPathEntry classPathEntry)
    {
        classPathEntries.add(index, classPathEntry);
    }

    public boolean add(ClassPathEntry classPathEntry)
    {
        return classPathEntries.add(classPathEntry);
    }

    public boolean addAll(ClassPath classPath)
    {
        return classPathEntries.addAll(classPath.classPathEntries);
    }

    public ClassPathEntry get(int index)
    {
        return classPathEntries.get(index);
    }

    public ClassPathEntry remove(int index)
    {
        return classPathEntries.remove(index);
    }

    public boolean isEmpty()
    {
        return classPathEntries.isEmpty();
    }

    public int size()
    {
        return classPathEntries.size();
    }
}