package mx.utm.ventas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import com.formdev.flatlaf.FlatLightLaf;

/**
 * Punto de entrada. Por ahora solo verifica que FlatLaf y SQLite funcionan;
 * después abrirá la ventana principal del sistema.
 */
public class Main {

    public static void main(String[] args) {
        FlatLightLaf.setup(); // el tema se aplica ANTES de crear cualquier componente

        // Swing no es thread-safe: toda la interfaz se crea en el Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            JFrame ventana = new JFrame("Sistema de Ventas");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.add(new JLabel(probarSQLite(), SwingConstants.CENTER));
            ventana.setSize(400, 200);
            ventana.setLocationRelativeTo(null); // centrar en pantalla
            ventana.setVisible(true);
        });
    }

    // Prueba temporal: base de datos en memoria, no crea ningún archivo
    private static String probarSQLite() {
        try (Connection con = DriverManager.getConnection("jdbc:sqlite::memory:")) {
            return "SQLite " + con.getMetaData().getDatabaseProductVersion() + " funcionando";
        } catch (SQLException e) {
            return "Error de SQLite: " + e.getMessage();
        }
    }
}
