package org.codehaus.mojo.gwt.shell;

/**
 * @author fcortina
 * @since 13/04/2014 - 11:14
 */
public final class CoverageConfiguration
{
    private boolean enabled;
    private String[] includes = {};
    private String[] excludes = {};

    public CoverageConfiguration()
    {
        this.enabled = true;
    }

    public boolean isEnabled()
    {
        return enabled;
    }

    public String[] getIncludes()
    {
        return includes;
    }

    public String[] getExcludes()
    {
        return excludes;
    }

    @Override
    public String toString()
    {
        return "{enabled=" + enabled + ", includes=" + includes + ", excludes=" + excludes + "}";
    }
}
