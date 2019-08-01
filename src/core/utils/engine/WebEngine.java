/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.utils.engine;

import core.utils.themplate.Detalle;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;

/**
 *
 * @author Administrador
 */
public class WebEngine {
    private final Detalle detalle = new Detalle();
    private JFXPanel jFxPanel;
    private Scene scene;
    private WebView webView;
    private String html;
    
    private void showInViwer() {
        Platform.runLater(() -> {
            webView.getEngine().loadContent(html);
        });
    }
    
    private void startViewer (){
        html = detalle.getDetalleClean();
        jFxPanel = new JFXPanel();
        
    }
     
    public void loadViewer (){
        Platform.runLater(() -> {
            webView = new WebView();
            webView.getEngine().loadContent(html);
            scene = new Scene(webView);
            jFxPanel.setScene(scene);
        });
    }
    
    public void showInViewer(String html) {
        Platform.runLater(() -> {
            webView.getEngine().loadContent(html);
        });
    }
    public void mostrarDetalle(Integer FACTURAID) {
        this.html = detalle.getDetalleHTML(FACTURAID);
        showInViwer();
    }
    
/******************************************************************************/
    
    public WebEngine() {
        startViewer ();
    }
    
/*
*   @return *******************************************************************/

    public JFXPanel getjFxPanel() {
        return jFxPanel;
    }
    
/******************************************************************************/
}
