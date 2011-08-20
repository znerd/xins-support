// See the COPYRIGHT file for copyright and license information
package org.znerd.xins.support;

import java.io.InputStream;
import java.io.IOException;
import java.net.URL;

import org.znerd.util.log.Limb;
import org.znerd.util.log.LogLevel;

/**
 * Class that represents the XINS Support library.
 * <p>
 * This class can be run as a program. When it is, all it does is print the name of this library and, if known, the version to standard out.
 */
public final class Library {

    private static final String VERSION = Library.class.getPackage().getImplementationVersion();

    /**
     * Returns the official human-readable name of this library.
     * 
     * @return the name, for example <code>"XINS Support Library"</code>, never <code>null</code>.
     */
    public static final String getName() {
        return "XINS Support Library";
    }

    /**
     * Returns the version of this library.
     * 
     * @return the version of this library, for example <code>"3.0"</code>, or <code>null</code> if unknown.
     */
    public static final String getVersion() {
        return VERSION;
    }

    public static final void main(String[] args) {
        if (VERSION == null) {
            System.out.println(getName());
        } else {
            System.out.println(getName() + " " + getVersion());
        }
    }

    private Library() {
    }
}
