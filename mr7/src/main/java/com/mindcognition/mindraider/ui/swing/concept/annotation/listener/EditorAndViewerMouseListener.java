/*
 ===========================================================================
   Copyright 2002-2010 Martin Dvorak

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 ===========================================================================
*/
package com.mindcognition.mindraider.ui.swing.concept.annotation.listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.mindcognition.mindraider.ui.swing.concept.annotation.renderer.AbstractTextAnnotationRenderer;

public class EditorAndViewerMouseListener implements MouseListener {
    
    private AbstractTextAnnotationRenderer renderer;
    
    public EditorAndViewerMouseListener(AbstractTextAnnotationRenderer renderer) {
        this.renderer=renderer;
    }
    public void mouseClicked(MouseEvent e) {
        if(e.getClickCount()==2) {
            // doubleclick - toggle mode
            renderer.toggleEditViewMode();
        }
    }
    public void mouseEntered(MouseEvent e) {
    }
    public void mouseExited(MouseEvent e) {
    }
    public void mousePressed(MouseEvent e) {
    }
    public void mouseReleased(MouseEvent e) {
    }
}
