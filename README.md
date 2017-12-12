# AdapterWorking
<h4> What is Adapter</h4>
An Adapter object acts as a bridge between an AdapterView and the underlying data for that view. The Adapter provides access to the data items. 
The Adapter is also responsible for making a View for each item in the data set.<br><br>
At a minimum, you will need to implement four methods.  These four methods are called by Android to build your AdapterView and to return the correct information when one of the items in the AdapterView is selected.
<ul>
<li>getCount( ):  indicates to Android how many items (or rows) are in the data set that will be presented in the AdapterView.</li>
<li>getItem(int pos):  get the data item associated with the item (or row) from the AdapterView passed as a parameter to the method.  This method will be used by Android to fetch the appropriate data to build the item/row in the AdapterView.</li>
<li>getItemId(int pos):  This method returns the data set’s id for a item/row position of the AdapterView.  Typically, the data set id matches the AdapterView rows so this method just returns the same value.</li>
<li>getView(int position, View convertView, ViewGroup parent):  This method creates the View (which may be a single View component like a TextView or a complex set of widgets in a layout) that displays the data for the specified (by position) item/row in the AdapterView.</li>
</ul>
