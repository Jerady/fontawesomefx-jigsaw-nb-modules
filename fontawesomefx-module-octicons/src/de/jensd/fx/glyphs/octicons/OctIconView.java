/**
 * Copyright (c) 2013-2016 Jens Deters http://www.jensd.de
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 */
package de.jensd.fx.glyphs.octicons;

import de.jensd.fx.glyphs.commons.GlyphIcon;
import java.io.IOException;
import javafx.scene.text.Font;

/**
 *
 * @author Jens Deters (mail@jensd.de)
 * @author Naoghuman (https://github.com/Naoghuman)
 */
public class OctIconView extends GlyphIcon<OctIcon> {

    public final static String TTF_PATH = "/de/jensd/fx/glyphs/octicons/octicons.ttf";

    static {
        try {
            Font.loadFont(OctIconView.class.getResource(TTF_PATH).openStream(), 10.0d);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public OctIconView(OctIcon icon) {
        super(OctIcon.class);
        setFont(new Font("Octicons", DEFAULT_ICON_SIZE));
        setIcon(icon);
    }

    public OctIconView() {
        this(OctIcon.MARK_GITHUB);
    }

    @Override
    public OctIcon getDefaultGlyph() {
        return OctIcon.MARK_GITHUB;
    }

}
