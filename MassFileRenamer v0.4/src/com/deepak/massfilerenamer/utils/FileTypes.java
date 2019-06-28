/*
 This file is part of MassFileRenamer v0.4

 MassFileRenamer is free software: you can redistribute it and/or modify
 it under the terms of the GNU Lesser General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 MassFileRenamer is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU Lesser General Public License for more details.

 You should have received a copy of the GNU Lesser General Public License
 along with MassFileRenamer.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.deepak.massfilerenamer.utils;

import java.io.File;
import java.util.ArrayList;

/**
 * this class provides a static method to list all file types within a folder
 *
 * @author deepak
 */
public class FileTypes {

    /**
     * method to get the list of all file types in a folder
     *
     * @param folder source folder from which the files types are listed
     * @return an array list of extension types
     */
    public static ArrayList<String> getFileTypesIn(File folder) {

        // if the folder doesnt exists or if the folder is not a directory 
        // then return null
        if (folder == null || !folder.exists() || !folder.isDirectory()) {
            return null;
        }

        ArrayList<String> fileTypes = new ArrayList<String>();
        String extension = null;
        String filename = null;

        // get all the files within the folder
        File files[] = folder.listFiles();

        // for every file
        for (File f : files) {

            // get the file name 
            filename = f.getName();

            // check if it contains '.' character
            if (filename.contains(".")) {

                // get the extension only
                extension = filename.substring(filename.lastIndexOf("."));

                // check if that extension has already been added to the list
                if (fileTypes.indexOf(extension) == -1) {
                    // else add to the list
                    fileTypes.add(extension);
                }
            }
        }
        return fileTypes;
    }
}
