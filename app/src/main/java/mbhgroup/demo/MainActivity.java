package mbhgroup.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Book> lstBook ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        String titlebd = getString(R.string.title);
        String man = getString(R.string.details);

        lstBook = new ArrayList<>();
        lstBook.add(new Book(titlebd,"Categorie Book",man,R.drawable.image));
        lstBook.add(new Book(titlebd,"Categorie Book",man,R.drawable.image));
        lstBook.add(new Book(titlebd,"Categorie Book",man,R.drawable.image));
        lstBook.add(new Book(titlebd,"Categorie Book",man,R.drawable.image));
        lstBook.add(new Book(titlebd,"Categorie Book",man,R.drawable.image));
        lstBook.add(new Book(titlebd,"Categorie Book",man,R.drawable.image));
        lstBook.add(new Book(titlebd,"Categorie Book",man,R.drawable.image));
        lstBook.add(new Book(titlebd,"Categorie Book",man,R.drawable.image));
        lstBook.add(new Book(titlebd,"Categorie Book",man,R.drawable.image));
        lstBook.add(new Book(titlebd,"Categorie Book",man,R.drawable.image));
        lstBook.add(new Book(titlebd,"Categorie Book",man,R.drawable.image));
        lstBook.add(new Book(titlebd,"Categorie Book",man,R.drawable.image));
        lstBook.add(new Book(titlebd,"Categorie Book",man,R.drawable.image));
        lstBook.add(new Book(titlebd,"Categorie Book",man,R.drawable.image));
        lstBook.add(new Book(titlebd,"Categorie Book",man,R.drawable.image));
        lstBook.add(new Book(titlebd,"Categorie Book",man,R.drawable.image));


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);


    }
}
