package diqizhou;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class KCBData implements TableModel {
	private String[] title = {
			"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"
	};
	private String[][] data = new String[10][7];
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 10 ;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public String getColumnName(int arg0) {
		return title[arg0];
	}

	@Override
	public Class<?> getColumnClass(int arg0) {
		// TODO Auto-generated method stub
		return String.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return data[rowIndex][columnIndex];
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		data[rowIndex][columnIndex] = (String)aValue;

	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

}
