package com.cursosdedesarrollo.kotlinandroidbase

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View

//importación del layout para usarlo directamente
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        //ya no es necesario el textview=this.findViewById(R.id.textView)
        // debido al import de arriba
        textView.setText("Hola Mundo!!")
        Log.d("app",textView?.toString())
        /*
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        */
    }

    fun onClick(v:View): Unit{
        Log.d("app","Botón pulsado")
        Snackbar.make(v, "Botón pulsado", Snackbar.LENGTH_LONG).show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            (R.id.action_settings) -> {
                Log.d("app","Realiza cualquier acción")
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
