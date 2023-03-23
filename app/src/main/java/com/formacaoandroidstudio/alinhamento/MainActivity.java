package com.formacaoandroidstudio.alinhamento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Utilizando o chain (corrente) - para alinhamento - ele faz uma conexão entre os itens, e esses
     * itens ficam distribuidos dentro desse espaço.
     *
     * Para utilizar o chain é preciso ter mais de dois componentes marcados (para marcar mais de
     * um componente pode usar o ctrl ou envolver os componentes com o mouse). Ao fazer isso
     * com o botão direito do mouse vai em 'chains'. Nele você vai poder criar um chain horizontal
     * ou vertical.
     *
     * É possivel mudar o modo de distribuição do chain nos componentes. Em cima do design com o botão direito do
     * mouse vai em 'Cycle Chain Model'. Lembrando que tem que estar marcado todos os componentes que você estiver
     * utilizando para poder utilizar o chain.
     * São três tipos de Cycle Chain Model:
     *  -> Spread (Espalhar)
     *  -> Spread Inside (Espalhar para dentro)
     *  -> Packed (Empacotar)
     *
     *
     * Lembrando: Para retirar as constraints - posso ir ao 'Clear All Constraints' ou
     *            com o botão direito do mouse em cima do design 'Clear Constraint of Select'.
     *
     * Vale ressaltar que se usar o chain na vertical, você precisará também conectar as constraints
     * para a horizontal, no caso, você irá ligar puxando a mola.
     *
     * */
}
