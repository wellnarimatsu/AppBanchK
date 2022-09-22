package br.com.appbanch_k

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

//    private val binding by lazy {
//        TelaCartaoBinding.inflate(layoutInflater)
//    }

    private lateinit var btnShowHide: ImageView
    private lateinit var visibleOff: ImageView
    private lateinit var visibleOn: ImageView

    private lateinit var txtValorSaldo: TextView
    private lateinit var txtValorSaldoEscondido: TextView

    private lateinit var btn_metas: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_metas = findViewById(R.id.btn_goals)

        btnShowHide = findViewById(R.id.btn_mostrar_esconder_saldo)
        visibleOff = findViewById(R.id.visibleOff)
        visibleOn = findViewById(R.id.visibleOn)
        txtValorSaldo = findViewById(R.id.text_valor_saldo)
        txtValorSaldoEscondido = findViewById(R.id.text_valor_saldo_escondido)

        btn_metas.setOnClickListener {
            val intent = Intent(this, ActivityGoals::class.java)
            startActivity(intent)
        }

        btnShowHide.setOnClickListener {

            if (visibleOff.visibility == View.VISIBLE && txtValorSaldo.visibility == View.VISIBLE &&
                visibleOn.visibility == View.INVISIBLE && txtValorSaldoEscondido.visibility == View.INVISIBLE
            ) {

                txtValorSaldo.visibility = View.INVISIBLE
                visibleOff.visibility = View.INVISIBLE

                visibleOn.visibility = View.VISIBLE
                txtValorSaldoEscondido.visibility = View.VISIBLE


            } else {

                txtValorSaldo.visibility = View.VISIBLE
                visibleOff.visibility = View.VISIBLE

                visibleOn.visibility = View.INVISIBLE
                txtValorSaldoEscondido.visibility = View.INVISIBLE


            }

        }


    }

    private fun showAndHide() {
//        if (binding.visibleOff.visibility == View.VISIBLE && binding.textValorSaldo.visibility == View.VISIBLE &&
//            binding.visibleOn.visibility == View.INVISIBLE && binding.textValorSaldoEscondido.visibility == View.INVISIBLE
//        ) {
//
//            binding.textValorSaldo.visibility = View.INVISIBLE
//            binding.visibleOff.visibility = View.INVISIBLE
//
//            binding.visibleOn.visibility = View.VISIBLE
//            binding.textValorSaldoEscondido.visibility = View.VISIBLE
//
//
//        } else {
//
//            binding.textValorSaldo.visibility = View.VISIBLE
//            binding.visibleOff.visibility = View.VISIBLE
//
//            binding.visibleOn.visibility = View.INVISIBLE
//            binding.textValorSaldoEscondido.visibility = View.INVISIBLE
//
//
//        }
    }


}


