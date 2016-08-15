/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rundown_v1;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;;

/**
 *
 * @author Md.Rifat-Ut-Tauwab
 */
public class MyTableRenderer implements TableCellRenderer{
     public static final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
      Component renderer = DEFAULT_RENDERER.getTableCellRendererComponent(
        table, value, isSelected, hasFocus, row, column);
      
        if(table.getModel().getValueAt(row, 1).toString().equalsIgnoreCase("PGM"))
          renderer.setBackground(new Color(0,0,0));
        else if(table.getModel().getValueAt(row, 1).toString().equalsIgnoreCase("COM")){
            renderer.setBackground(Color.BLUE);
        }
        else if(table.getModel().getValueAt(row, 1).toString().equalsIgnoreCase("FILLER")){
            renderer.setBackground(Color.cyan);
        }
        else if(table.getModel().getValueAt(row, 1).toString().startsWith("LIVE")){
            renderer.setBackground(Color.RED);
        }
        
        else{
            renderer.setBackground(new Color(240,221,127));
        }
        if(table.getModel().getValueAt(row, column).toString().equalsIgnoreCase("Played")){
            renderer.setBackground(new Color(102,102,102));
        }
        if(table.getModel().getValueAt(row, column).toString().equalsIgnoreCase("Running")){
            renderer.setBackground(Color.GREEN);
        }
        if(table.getModel().getValueAt(row, column).toString().equalsIgnoreCase("Upcoming")){
            renderer.setBackground(new Color(0,200,225));
            
        }
        return renderer;
    }

  
}
