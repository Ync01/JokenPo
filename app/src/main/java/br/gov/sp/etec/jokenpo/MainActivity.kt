package br.gov.sp.etec.jokenpo

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var txtResultado: TextView
    private lateinit var imageComputador: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())

            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )

            insets
        }

        // Inicializa os componentes
        txtResultado = findViewById(R.id.textResultado)
        imageComputador = findViewById(R.id.imageComputador)

        val pedra = findViewById<ImageView>(R.id.imagePedra)
        val tesoura = findViewById<ImageView>(R.id.imageTesoura)
        val papel = findViewById<ImageView>(R.id.imagePapel)

        pedra.setOnClickListener {
            jogar("pedra")
        }

        tesoura.setOnClickListener {
            jogar("tesoura")
        }

        papel.setOnClickListener {
            jogar("papel")
        }
    }

    private fun jogar(jogador: String) {

        val opcoes = arrayOf("papel", "tesoura", "pedra")

        // Escolha aleatória do computador
        val computador = opcoes[Random.nextInt(opcoes.size)]

        // Mostra a jogada do computador
        when (computador) {
            "papel" -> imageComputador.setImageResource(R.drawable.papel)
            "tesoura" -> imageComputador.setImageResource(R.drawable.tesoura)
            "pedra" -> imageComputador.setImageResource(R.drawable.pedra)
        }

        // Verifica o resultado
        when {
            jogador == computador -> {
                txtResultado.text = "Empate"
            }

            jogador == "pedra" && computador == "tesoura" -> {
                txtResultado.text = "Você Venceu!"
            }

            jogador == "papel" && computador == "pedra" -> {
                txtResultado.text = "Você Venceu!"
            }

            jogador == "tesoura" && computador == "papel" -> {
                txtResultado.text = "Você Venceu!"
            }

            else -> {
                txtResultado.text = "Você Perdeu!"
            }
        }
    }
}
