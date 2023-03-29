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
     * Outro truque de alinhamento são as 'constrain' que te dá quatro opções de alinhamento, são eles:
     * (1)parent top (2) parent bottom (3) parent start (4) parent end. Esse funcionalidade define um espaçamento
     * já definido. Basta clicar com o botão direito do mouse em cima do componente e ir na opção 'constrain'.
     *
     * Outro truque de alinhamento é o "Organize" que expande o componente para a horizontal ou vertical.
     * Basta clicar com o botão direito do mouse em cima do componente e ir na opção 'Organize'.
     *
     * Outro truque de alinhamento é o "Center" que cria as conexões centralizada no componente. E te dá quatro opções
     * de uso: (1)Horizontally (2) Vertically (3) Horizontally in Parent (4) Vertically in Parent.
     * Basta clicar com o botão direito do mouse em cima do componente e ir na opção 'center'.
     *
     * Outro truque de alinhamento é o "Align" que cria conexoes entre as extremidades. E te dá sete opções de uso:
     * (1) Left Edges (2) Horizontal Centers (3) Right Edges (4) Top Edges (5) Vertical Centers (6) Bottom Edges (7) Baselines
     * Basta clicar com o botão direito do mouse em cima do componente e ir na opção 'align'.
     *
     * É possível alinhar componente dentro de componente, tantos com as funcionalidades ditas acima quanto com conexoes
     * sendo puxadas por você.
     *
     * Existem outros tipos de layout, no caso, nós estamos usando o 'ConstraintLayout' (por padrão é criado esse layout),
     * através do 'Component Tree' é possível visualizar a árvore de componentes do seu projeto.
     *
     * Outro layout é o 'RelativeLayout'. Para usar esse tipo de layout basta ir no arquivo arctivity_main.xml na aba de code
     * e substitui a tag do 'ConstraintLayout' por 'RelativeLayout'. O layout relativo permite que você alinhe os componentes um baseado no outro.
     *
     * Outro layout é o "LinearLayout" que pode ter duas configurações, são elas, horizontal ou vertical. Esse Layout faz
     * referência a linha, tanto na horizontal, quanto na vertical. A orientação pode ser definida no 'atributtes' na
     * propriedade 'orientation' e pode ser tanto na horizonta, quanto na vertical.
     *
     * Dica: É possível converter do 'LinearLayout' para o 'ConstraintLinear' e entre outros layouts. Basta ir no arquivo
     * 'activity_main.xml' na aba 'Component Tree' e com o botão direito do mouse busque a opção 'Convert view...' e
     * escolhe a opção 'ConstraintLayout' e aplica (apply).
     *
     * No caso, vamos ver o layout 'FrameLayout'. Esse Layout é um componente que permite que coloque camadas um sobre o
     * outro, ou seja, pode colocar componentes um sobre o outro. IMPORTANTE: Para cada camada é preciso colocar um
     * 'Frame Layout' (basta ir na Palette e pesquisar por FrameLayout e arrastar para o design). Por exemplo:
     *
     *     FrameLayout
     *     textView       (DICA: Pode alinhar esses componentes usando o layout_gravity)
     *     FrameLayout
     *     imagem_2
     *     FrameLayout
     *     imagem_3
     *
     * A estrutura feita acima é possível visualizar no 'Component Tree', que é tipo uma árvore dos componentes que estão
     * sendo utilizados.
     *
     * Outro layout é o 'CordenationLayout', ele tem a mesma função do FrameLayout, porém é uma evolução, já que tem mais
     * opções de configurações (+ recursos).
     *
     *
     *
     *
     * */
}
