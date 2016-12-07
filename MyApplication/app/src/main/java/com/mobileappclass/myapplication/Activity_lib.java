package com.mobileappclass.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class Activity_lib extends AppCompatActivity {

    private EditText newTaskText;
    private EditText newTaskDescription;

    private ArrayList<Book> Books;
   // private Book[] books;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib);
        Books = new ArrayList<>();

        addBooks();

        // Sets up the toolbar
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar_lib);
        setSupportActionBar(myToolbar);


        GridView gridView=(GridView) findViewById(R.id.gridview_LIB);
        BooksAdapter1 booksAdapter=new BooksAdapter1(this,Books);
        gridView.setAdapter(booksAdapter);
    }

    // Hardcoded Books
    private void addBooks() {
        Books.add(new Book(R.string.abc_an_amazing_alphabet_book, R.string.dr_seuss, R.drawable.abc));
        Books.add(new Book(R.string.are_you_my_mother, R.string.dr_seuss, R.drawable.areyoumymother));
        Books.add(new Book(R.string.where_is_babys_belly_button, R.string.karen_katz, R.drawable.whereisbabysbellybutton));
        Books.add(new Book(R.string.on_the_night_you_were_born, R.string.nancy_tillman, R.drawable.onthenightyouwereborn));
        Books.add(new Book(R.string.hand_hand_fingers_thumb, R.string.dr_seuss, R.drawable.handhandfingersthumb));
        Books.add(new Book(R.string.the_very_hungry_caterpillar, R.string.eric_carle, R.drawable.theveryhungrycaterpillar));
        Books.add( new Book(R.string.the_going_to_bed_book, R.string.sandra_boynton, R.drawable.thegoingtobedbook));
        Books.add(new Book(R.string.oh_baby_go_baby, R.string.dr_seuss, R.drawable.ohbabygobaby));
        Books.add( new Book(R.string.the_tooth_book, R.string.dr_seuss, R.drawable.thetoothbook));
        Books.add(new Book(R.string.one_fish_two_fish_red_fish_blue_fish, R.string.dr_seuss, R.drawable.onefish));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_toolbar_library,menu);

        return super.onCreateOptionsMenu(menu);
    }

    //private Book[] books
    // Hardcoded addition of Books

/*
     private Book[] books =
            {
                    new Book(R.string.abc_an_amazing_alphabet_book, R.string.dr_seuss, R.drawable.abc),
                    new Book(R.string.are_you_my_mother, R.string.dr_seuss, R.drawable.areyoumymother),
                    new Book(R.string.where_is_babys_belly_button, R.string.karen_katz, R.drawable.whereisbabysbellybutton),
                    new Book(R.string.on_the_night_you_were_born, R.string.nancy_tillman, R.drawable.onthenightyouwereborn),
                    new Book(R.string.hand_hand_fingers_thumb, R.string.dr_seuss, R.drawable.handhandfingersthumb),
                    new Book(R.string.the_very_hungry_caterpillar, R.string.eric_carle, R.drawable.theveryhungrycaterpillar),
                    new Book(R.string.the_going_to_bed_book, R.string.sandra_boynton, R.drawable.thegoingtobedbook),
                    new Book(R.string.oh_baby_go_baby, R.string.dr_seuss, R.drawable.ohbabygobaby),
                    new Book(R.string.the_tooth_book, R.string.dr_seuss, R.drawable.thetoothbook),
                    new Book(R.string.one_fish_two_fish_red_fish_blue_fish, R.string.dr_seuss, R.drawable.onefish)

            };
            */

    // To Handle AppBar Dropdown button clicks
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){


            case R.id.addBook_lib:



                return true;

            case R.id.deleteBook_lib:



                return true;

            case R.id.settings_lib:



                return true;

            default:



                return super.onOptionsItemSelected(item);



        }


    }



    // Search Button Clicked
    public void searchClick_lib(MenuItem item) {

        LayoutInflater li = LayoutInflater.from(this);
        LinearLayout newtaskLayout = (LinearLayout)li.inflate(R.layout.search_popup,null);

        newTaskText = (EditText) newtaskLayout.getChildAt(0);
        newTaskDescription = (EditText) newtaskLayout.getChildAt(1);

        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        alertDialogBuilder.setTitle("Find Books");
        alertDialogBuilder.setView(newtaskLayout);

        alertDialogBuilder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                // TODO Actually search through Library
                Toast.makeText(Activity_lib.this,"Search Clicked",Toast.LENGTH_LONG).show();


            }
        });

        alertDialogBuilder.setNegativeButton("Cancel",null);
        alertDialogBuilder.show();






    }


    public void homeClick_lib(MenuItem item) {



        // TODO open homescreen back




    }
}
