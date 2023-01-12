package upc.edu.dsa.myapplication.Activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.github.muddz.styleabletoast.StyleableToast;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import upc.edu.dsa.myapplication.Entities.ObjetoTienda;
import upc.edu.dsa.myapplication.Entities.Pou;
import upc.edu.dsa.myapplication.PouRetrofit;
import upc.edu.dsa.myapplication.PouServices;
import upc.edu.dsa.myapplication.R;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import upc.edu.dsa.myapplication.Entities.VO.*;

import java.util.*;
import io.github.muddz.styleabletoast.StyleableToast;

public class Activity_Preguntas_Frecuentes extends AppCompatActivity {
    TextView faqs, pregunta, pregunta_titulo, respuesta, respuesta_titulo;
    Button siguiente_pregunta;

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // VARIABLES GLOBALES DEL POU QUE SE PASAN ENTRE LAS ACTIVITIES.
    String data_pouId = "marc";
    String data_nombrePou = "Marc";
    String data_nacimientoPou = "28/10/2001";
    String data_correoPou = "marc@gmail.com";
    String data_passwordPou = "Calella";
    int recordPou = 0;
    int lvlHambre = 28;
    int lvlSalud = 10;
    int lvlDiversion = 200;
    int lvlSueno = 1;
    int amountDinero = 50;
    int amountCandy = 1;
    int amountManzana = 6;
    int amountPizza = 6;
    int amountAgua = 6;
    int amountAquarius = 6;
    int amountRoncola = 6;
    int amountHambre = 1;
    int amountSalud = 1;
    int amountDiversion = 1;
    int amountSueno = 1;
    String pouEstado = "normal";
    String pouCamiseta = "spain";
    String pouBambas = "veja";
    String pouGafas = "nada";
    String pouGorro = "cerveza";
    String posee_pijama = "NO";
    String posee_fcb = "NO";
    String posee_spain = "YES";
    String posee_messi = "NO";
    String posee_rafa = "YES";
    String posee_veja = "NO";
    String posee_fiesta = "NO";
    String posee_rayban = "YES";
    String posee_ciclismo = "NO";
    String posee_cerveza = "YES";
    String posee_boina = "NO";
    String posee_polo = "YES";
    String activityOrigen = "Juego";
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -


    RecyclerView rv_articuloTienda;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<DataModel> data;
    static View.OnClickListener myOnClickListener;

    PouServices pouServices;

    @SuppressLint({"SetTextI18n", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preguntas_frecuentes);

        siguiente_pregunta =(Button) findViewById(R.id.siguiente_pregunta);
        
        faqs = findViewById(R.id.preguntas_frecuentes);
        pregunta = findViewById(R.id.pregunta);
        pregunta_titulo = findViewById(R.id.pregunta_titulo);
        respuesta = findViewById(R.id.respuesta);
        respuesta_titulo = findViewById(R.id.respuesta_titulo);

        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        // DECLARACIÓN INICIAL DE LOS DATOS.

        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

        pouServices = PouRetrofit.getInstance().getPouServices();
        Call<List<String>> peticion = pouServices.listaPreguntasRespuestas("FAQS");

        peticion.enqueue(new Callback<List<String>>() {


            @Override
            public void onResponse(Call<List<String>> call, Response<List<String>> response) {
                switch (response.code()){
                    case 201:
                        List<String> listaPreguntasRespuestas = response.body();

                        String[] lista = listaPreguntasRespuestas.Split("-");



                        Lista[1];

                    }

                    break;

            }

            @Override
            public void onFailure(Call<List<String>> call, Throwable t) {

            }


        }

    }
}
