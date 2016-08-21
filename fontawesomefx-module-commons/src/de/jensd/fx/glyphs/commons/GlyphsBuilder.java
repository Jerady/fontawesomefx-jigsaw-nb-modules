/**
 * Copyright (c) 2013-2016 Jens Deters http://www.jensd.de
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 *
 */
package de.jensd.fx.glyphs.commons;

import java.lang.reflect.InvocationTargetException;


/**
 *
 * @author Jens Deters (mail@jensd.de)
 */
public class GlyphsBuilder {

    private GlyphIcon glyphIcon;

    private GlyphsBuilder(Class<? extends GlyphIcon> clazz) {
        try {
            glyphIcon = clazz.getConstructor().newInstance();
        } catch (InstantiationException | InvocationTargetException | IllegalAccessException | NoSuchMethodException | SecurityException ex) {
           throw new RuntimeException(ex);
        }
    }

    public static GlyphsBuilder create(Class<? extends GlyphIcon> clazz) {
        return new GlyphsBuilder(clazz);
    }

    public GlyphsBuilder glyph(GlyphIcons glyph) {
        glyphIcon.setGlyphName(glyph.name());
        return this;
    }

    public GlyphsBuilder size(String size) {

        glyphIcon.setSize(size);
        return this;
    }

    public GlyphsBuilder style(String style) {
        glyphIcon.setGlyphStyle(style);
        return this;
    }

    public GlyphsBuilder styleClass(String styleClass) {
        glyphIcon.setStyleClass(styleClass);
        return this;
    }

    public GlyphIcon build() {
        return glyphIcon;
    }

}
