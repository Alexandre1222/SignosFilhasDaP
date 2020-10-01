package com.example.signosfilhasdap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] Signos = {"Aries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes"};
    String [] Aries = {
            "O ariano é aquele grosso sem noção que usa a desculpa de ser “super sincero” para ofender os outros.",
            "Acha que faz melhor que todo mundo e que tem que ser o chefe da parada, mas como não tem vocação nenhuma para líder, tenta fazer isso na marra mesmo.",
            "Sob a desculpa de “não aceitar desaforo” arruma barraco onde quer que passa o que não faz dele uma pessoa autentica como ele acredita, só um grosso que todos costumam evitar.",
            "Tem problemas para trabalhar em grupo porque quer as coisas sempre do próprio jeito, mas também não tem competência para isso.",
            "Ele gosta mesmo é de mandar nos outros e para conseguir isso não tem escrúpulo nenhum em foder qualquer um que tente impedir."
    };
    String [] Touro = {
            "O taurino é um escrotinho que gosta de dinheiro e para isso trabalha feito um burro de carga.",
            "Sua tendência de ser pão duro, intransigente e sovina é quase lendária.",
            "É mega teimoso, e a única coisa que fez é merda uma atrás da outra, mas continua fazendo, pois acredita que o seu jeito é sempre o certo.",
            "O taurino costuma de perguntar: por que trabalho tanto e mesmo assim só tomo no cu? Fácil, porque ele não consegue ver um palmo além do próprio nariz, é um demente sem visão nem criatividade.",
            "Ele sempre trabalha mais que todo mundo na vida, mas o fato de nunca escutar ninguém faz ele ser mesmo fodido sempre, até o dia da sua morte."
    };
    String [] Gemeos = {
            "Quem criou o termo “falsiane” estava pensando num geminiano.",
            "Pensa numa pessoa fofoqueira, mentirosa, cara de pau e filha da puta.",
            "Nunca confie num geminiano, ele é do mau. No ambiente de trabalho é aquele que sorri para todo mundo, faz amizade até com a moça do café, mas na primeira oportunidade entrega tudo para o chefe.",
            "Moral e caráter para ele é tão intangível quando o conceito de universo infinito, ele até sabe o que é, mas não entendo como funciona.",
            "Adora foder com a vida dos outros e é um galinha miserável que não consegue deixar as calças quietas."
    };
    String [] Cancer = {
            "O canceriano faz nada coisa além de chorar feito um imbecil por qualquer coisinha.",
            "Seu esporte favorito é reclamar da vida, mesmo que ela esteja maravilhosa.",
            "Se acha o bonzinho da parada, o senhor da compreensão, mas na verdade é um puxa saco e deixa todo mundo cagar na cabeça dele como o bundão que é só para pagar de bonzinho.",
            "Seu único objetivo na vida é se dar bem, doa a quem doer, e o pior de tudo é que ele sempre consegue com essa cara de sonso, mas lá no fundo, todo mundo sabe que ele é um canalha.",
            "Se alguém pressioná-lo, ele recorre a chantagem emocional, ataques de pelanca e birras homéricas com lagrimazinhas de crocodilo fazendo os outros pensarem que ele é sensível, mas na verdade é só um Drama Queen chantagista do caralho."
    };
    String [] Leao = {
            "Todo leonino tem um sonho, o de ser um Martin Luter King da vida, mas na verdade é só um idiota egocêntrico que pensa que sabe mais que todo mundo.",
            "Sua arrogância é tão insuportável, que às vezes nem ele mesmo se aguenta.",
            "Ele é um metido e puxa-saco que tenta se dar bem através de sorrisinhos falsos ao invés do trabalho.",
            "O leonino sabe que é um bosta, mas não desiste de tentar parecer o rei da cocada preta.",
            "Gosta de chamar a atenção, mesmo que para isso tenha que pendurar uma melancia na cabeça."
    };
    String [] Virgem = {
            "O virginiano é um babaca metidinho a perfeccionista e metódico, que gosta de ficar observando a vida alheia e criticando o que os outros fazem.",
            "Essa mania escrota faz de dele o pior burocrata que alguém pode encontrar.",
            "O virginiano é como uma pedra, sem nenhuma criatividade ou capacidade de imaginação.",
            "Seu esporte preferido é tomar conta da vida alheia, criticar e tecer comentários sobre como os outros devem viver a própria vida, apesar da dele estar uma grande merda.",
            "Qualquer um que precisa preencher pelo menos cinco vezes uma porra de um formularia de quinze vias carbonadas, de cinco cores diferentes e que devem ser preenchidos a mão não guarda dúvidas de que foi um babaca de um virginiano quem inventou isso."
    };
    String [] Libra = {
            "O libriano gosta de parecer idealista e justo, de concordar com causas sociais e lutar pelo direito das minorias. Mas todo mundo sabe que lá no fundo ele só se importa com três pessoas: ele, ele mesmo e o filho da mãe dele (quando ela tem filho único).",
            "Seu estilo é ser um mauricinho metido a besta, que paga de sofisticado, mas é tão ignorante e desinformado que na maioria das vezes só passa vergonha mesmo.",
            "Gosta de pagar de entendido de literatura, cinema e arte, mas se rola um assunto polêmico, que envolve opinião própria ele coloca o rabo entre as pernas e sai correndo.",
            "Gosta de tirar onda de politicamente correto, de preocupado com um bem maior, mas no fundo não está nem ai pra ninguém, faz isso para aparecer mesmo.",
            "E o pior que é ninguém desconfia que a maior ambição do libriano é ferrar com todo mundo ao seu redor e ainda sair com pose de bonzão."
    };
    String [] Escorpiao = {
            "De todos os signos, o escorpiano é o mais filho da puta.",
            "É uma criaturinha vingativa, melindrosa, obsessiva, rancorosa, preguiçosa, fria, cruel, antiética, mal caráter, infiel, orgulhosa, pessimista, racista, egoísta, falsa, venenosa, mentirosa, traiçoeira, cínica e fofoqueira.",
            "No dicionário se você procurar a palavra “canalha” aparece a foto de um escorpiano, o mesmo ocorre no Google Imagens.",
            "As únicas pessoas que os escorpianos são capazes de amar é a própria mãe e a si mesmo, e olha que eles só amam a mãe quando elas são coniventes com tudo o que eles fazem.",
            "Em resumo, eles não deveria sequer ter nascido. Essas criaturinhas tirânicas, dão sempre ótimos nazistas, facistas ou admiradores do Bolsonaro. Seu esporte é lascar com a vida alheia e sempre tem um orgasmo quando conseguem isso. Pelo bem da humanidade, seria bom exterminar todos eles."
    };
    String [] Sagitario = {
            "O sagitariano é um babaca otimista, que acredita que tudo é questão de sorte.",
            "O que é até bom, porque ele é um irresponsável, sem noção e sem talento, em suma, um merdinha.",
            "Como grande incompetente que é, sempre culpa os outros pelos próprios fracassos, mas lá no fundinho sabe que ele é um merda fracassado e a culpa é toda dele.",
            "É incapaz de se mexer para fazer qualquer coisa. E quando resolve fazer é incompetente demais para conseguir.",
            "É mais teimoso que uma mula, ambicioso e metido a besta. Moral e ética são conceitos bastante flexíveis ao seu ver, e ele deturpa essas duas coisas sempre que lhe aprovem."
    };
    String[] Capricornio = {
            "O capricorniano gosta de pagar de pessoa séria, conservadora e politicamente correta.",
            "Mas na verdade é só um viciado em dinheiro, falso e safado, cuja única meta da vida é juntar grana.",
            "Há uma grande tendência em ser enrustido também.",
            "É frio, nem sabe o que são emoções e é comum dormir no meio de uma trepada.",
            "É aquele que paga de amigão, caridoso, boa praça, pau para toda obra, mas na primeira oportunidade fala mal pelas costas."
    };
    String [] Aquario = {
            "Parece que todo aquariano é um ET.",
            "É metido a criativo e progressista, mas sempre comete os mesmos erros uma e outra vez porque é um babaca teimoso incapaz de escutar outras pessoas.",
            "Seu esporte é ser “do contra”, mas é só para aparecer mesmo.",
            "Se estiver numa multidão com um milhão de pessoas, vai dar um jeito de aparecer, como um babaca sem noção que faz seus amigos sentirem vergonha alheia.",
            "Seu sonho é que alguém faça a piada da “diferentona” com ele, só para se sentir especial. No fundo ele sabe que é só um bosta."
    };
    String [] Peixes = {
            "O pisciano tem aquela mania nojenta de achar que todo mundo é burro e só ele é o espertão.",
            "Se acha o Eistein do zodíaco e acredita que todo mundo precisa dele para fazer as coisas.",
            "É incapaz de disfarçar que está ajudando só porque considera a outra pessoa burra, e ele como mais inteligente pode fazer melhor.",
            "Adora ficar corrigindo e reprimindo tudo o que os outros fazem, que nem um grande pau no cu, e curte se meter na vida dos outros para dar conselhos não solicitados.",
            "Mas todos sabem que sempre que seguem um conselho de um pisciano é para se foder, pois apesar dele se achar inteligente, ele não é tanto assim. Pisciano é incapaz de organizar qualquer coisa, praticidade é uma palavra que ele não entende, e se perguntar em que planeta ele está, provavelmente irá responder Plutão (que nem planeta é)."
    };
    int i[] = {0,0,0,0,0,0,0,0,0,0,0,0};
    ListView Astros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Astros = findViewById(R.id.ListViewSignos);
        ArrayAdapter<String> Sign = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Signos);
        Astros.setAdapter(Sign);
        Astros.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        if (i[0] == 5){
                            Toast.makeText(MainActivity.this, "Acabou poha, queria mais?", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(MainActivity.this, Aries[i[0]], Toast.LENGTH_LONG).show();
                            i[position]++;
                        }
                        break;
                    case 1:
                        if (i[1] == 5){
                            Toast.makeText(MainActivity.this, "Acabou poha, queria mais?", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(MainActivity.this, Touro[i[1]], Toast.LENGTH_LONG).show();
                            i[position]++;
                        }
                        break;
                    case 2:
                        if (i[2] == 5){
                            Toast.makeText(MainActivity.this, "Acabou poha, queria mais?", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(MainActivity.this, Gemeos[i[2]], Toast.LENGTH_LONG).show();
                            i[position]++;
                        }
                        break;
                    case 3:
                        if (i[3] == 5){
                            Toast.makeText(MainActivity.this, "Acabou poha, queria mais?", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(MainActivity.this, Cancer[i[3]], Toast.LENGTH_LONG).show();
                            i[position]++;
                        }
                        break;
                    case 4:
                        if (i[4] == 5){
                            Toast.makeText(MainActivity.this, "Acabou poha, queria mais?", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(MainActivity.this, Leao[i[4]], Toast.LENGTH_LONG).show();
                            i[position]++;
                        }
                        break;
                    case 5:
                        if (i[5] == 5){
                            Toast.makeText(MainActivity.this, "Acabou poha, queria mais?", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(MainActivity.this, Virgem[i[5]], Toast.LENGTH_LONG).show();
                            i[position]++;
                        }
                        break;
                    case 6:
                        if (i[6] == 5){
                            Toast.makeText(MainActivity.this, "Acabou poha, queria mais?", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(MainActivity.this, Libra[i[6]], Toast.LENGTH_LONG).show();
                            i[position]++;
                        }
                        break;
                    case 7:
                        if (i[7] == 5){
                            Toast.makeText(MainActivity.this, "Acabou poha, queria mais?", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(MainActivity.this, Escorpiao[i[7]], Toast.LENGTH_LONG).show();
                            i[position]++;
                        }
                        break;
                    case 8:
                        if (i[8] == 5){
                            Toast.makeText(MainActivity.this, "Acabou poha, queria mais?", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(MainActivity.this, Sagitario[i[8]], Toast.LENGTH_LONG).show();
                            i[position]++;
                        }
                        break;
                    case 9:
                        if (i[9] == 5){
                            Toast.makeText(MainActivity.this, "Acabou poha, queria mais?", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(MainActivity.this, Capricornio[i[9]], Toast.LENGTH_LONG).show();
                            i[position]++;
                        }
                        break;
                    case 10:
                        if (i[10] == 5){
                            Toast.makeText(MainActivity.this, "Acabou poha, queria mais?", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(MainActivity.this, Aquario[i[10]], Toast.LENGTH_LONG).show();
                            i[position]++;
                        }
                        break;
                    case 11:
                        if (i[11] == 5){
                            Toast.makeText(MainActivity.this, "Acabou poha, queria mais?", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(MainActivity.this, Peixes[i[11]], Toast.LENGTH_LONG).show();
                            i[position]++;
                        }
                        break;
                }
            }
        });
    }
}