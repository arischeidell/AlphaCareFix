/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.File;

/**
 *
 * @author ariannascheidell
 */
public class Permission {
    private boolean canWrite;
    private boolean canRead;
    private boolean canExecute;
    private File file;

    /**
     * This is the default constructor for the Permission class.
     * @param canWrite A boolean representing whether the user can write to a file.
     * @param canRead A boolean representing whether the user can read from a file.
     * @param canExecute A boolean representing whether the user can execute a file.
     * @param file 
     */
    public Permission(boolean canWrite, boolean canRead, boolean canExecute, File file) {
        this.canWrite = canWrite;
        this.canRead = canRead;
        this.canExecute = canExecute;
        this.file = file;
    }

    /**
     * Returns a boolean representing whether the user can write to a file.
     * @return A boolean representing whether the user can write to a file.
     */
    public boolean canWrite() {
        return canWrite;
    }
    
    /**
     * Sets a boolean representing whether the user can write to a file.
     * @param canWrite A boolean representing whether the user can write to a file.
     */
    public void setCanWrite(boolean canWrite) {
        this.canWrite = canWrite;
    }

    /**
     * Returns a boolean representing whether the user can read from a file.
     * @return a boolean representing whether the user can read from a file.
     */
    public boolean canRead() {
        return canRead;
    }

    /**
     * Sets a boolean representing whether the user can read from a file.
     * @param canRead A boolean representing whether the user can read from a file.
     */
    public void setCanRead(boolean canRead) {
        this.canRead = canRead;
    }

    /**
     * Returns a boolean representing whether the user can execute a file.
     * @return A boolean representing whether the user can execute a file.
     */
    public boolean canExecute() {
        return canExecute;
    }

    /**
     * Sets a boolean representing whether the user can execute a file.
     * @param canExecute A boolean representing whether the user can execute a file.
     */
    public void setCanExecute(boolean canExecute) {
        this.canExecute = canExecute;
    }

    /**
     * Returns the File that the permissions refer to.
     * @return The File that the permissions refer to.
     */
    public File getFile() {
        return file;
    }

    /**
     * Sets the File that the permissions refer to.
     * @param file The File that the permissions refer to.
     */
    public void setFile(File file) {
        this.file = file;
    }
}
