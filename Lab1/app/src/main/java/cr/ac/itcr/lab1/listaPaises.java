package cr.ac.itcr.lab1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;

public class listaPaises extends ListFragment {

    // Array of strings storing country names
    String[] paises = new String[] {
            "Brazil", "Chile", "China", "Colombia", "Costa Rica", "Costa de Marfil", "Croacia", "El Salvador",
            "Inglaterra", "Francia", "Alemania", "Italia", "Portugal", "Sudáfrica", "Corea Del Sur", "España",
            "SriLanka", "Estados Unidos", "Uruguay", "Venezuela", "Wales"
    };

    // Array of integers points to images stored in /res/drawable/
    int[] flags = new int[]{
            R.drawable.brazil, R.drawable.chile, R.drawable.china, R.drawable.colombia, R.drawable.cr,
            R.drawable.costamarfil, R.drawable.croatia, R.drawable.salvador, R.drawable.england, R.drawable.france,
            R.drawable.germany, R.drawable.italy, R.drawable.portugal, R.drawable.sudafrica, R.drawable.coreasur,
            R.drawable.espana, R.drawable.srilanka, R.drawable.usa, R.drawable.uruguay, R.drawable.venezuela,
            R.drawable.wales
    };


    String[] poblacion = new String[]{
            "200,4 millones",
            "17,62 millones",
            "1,357 miles de millones",
            "48,32 millones",
            "4,9 millones",
            "20,32 millones",
            "4,29 millones",
            "6,34 millones",
            "5301 millones",
            "66,9 millones",
            "80,62 millones",
            "59,83 millones",
            "10,46 millones",
            "52,98 millones",
            "49,54 millones",
            "46,77 millones",
            "20,28 millones",
            "318,9 millones",
            "3,407 millones",
            "30,62 millones",
            "3,06 millones"

    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        // Cada linea en la lista almacena el pais, poblacion y la bandera
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

        for(int i=0;i<21;i++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("txt", "Pais: " + paises[i]);
            hm.put("cur","Poblacion: " + poblacion[i]);
            hm.put("flag", Integer.toString(flags[i]) );
            aList.add(hm);
        }

        // Keys used in Hashmap
        String[] from = { "flag","txt","cur" };

        // Ids of views in listview_layout
        int[] to = { R.id.flag,R.id.txt,R.id.cur};

        // Instantiating an adapter to store each items
        // R.layout.list_view defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList, R.layout.list_view, from, to);

        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
