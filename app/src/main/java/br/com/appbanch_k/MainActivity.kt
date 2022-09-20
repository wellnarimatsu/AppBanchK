package br.com.appbanch_k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import br.com.appbanch_k.databinding.ActivityMainBinding
import br.com.appbanch_k.databinding.TelaCartaoBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        TelaCartaoBinding.inflate(layoutInflater)
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnMostrarEsconderSaldo.setOnClickListener{

           if (binding.visibleOff.visibility == View.VISIBLE && binding.textValorSaldo.visibility == View.VISIBLE &&
               binding.visibleOn.visibility == View.INVISIBLE && binding.textValorSaldoEscondido.visibility == View.INVISIBLE){

               binding.textValorSaldo.visibility= View.INVISIBLE
               binding.visibleOff.visibility= View.INVISIBLE

               binding.visibleOn.visibility = View.VISIBLE
               binding.textValorSaldoEscondido.visibility = View.VISIBLE
//
//               if(binding.visibleOn.visibility == View.INVISIBLE && binding.textValorSaldoEscondido.visibility == View.INVISIBLE){
//
//                   binding.visibleOn.visibility = View.VISIBLE
//                   binding.textValorSaldoEscondido.visibility = View.VISIBLE
//
//               }


           }else{

               binding.textValorSaldo.visibility= View.VISIBLE
               binding.visibleOff.visibility= View.VISIBLE

               binding.visibleOn.visibility = View.INVISIBLE
               binding.textValorSaldoEscondido.visibility = View.INVISIBLE


           }

           }



//            binding.visibleOff.visibility = View.INVISIBLE
//            binding.visibleOn.visibility = View.VISIBLE
//
//            binding.textValorSaldo.visibility= View.INVISIBLE
//            binding.textValorSaldoEscondido.visibility = View.VISIBLE


        }


    }

//    fun showHide(view1 : View, view2: View){
//
//        if (view1.visibility == View.VISIBLE && view2.visibility == View.VISIBLE){
//
//            view1.visibility = View.INVISIBLE
//            view2.visibility = View.INVISIBLE
//        }else{
//
//
//        }
//
//    }
