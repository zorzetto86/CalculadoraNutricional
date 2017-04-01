package calculadoranutricional.servicos;

import calculadoranutricional.AlimentoDieta;
import calculadoranutricional.Alimentos;
import calculadoranutricional.db.AlimentoDB;

public class AlimentoDietaServicos {
    
    public int calculaProporcional(AlimentoDieta alimentoDieta){ //calcula o valor de nutrientes do alimento, de acordo com a quantidade inserida
      int total;
      Alimentos alimento = new Alimentos();      
      AlimentoDB caloriasPadrao = new AlimentoDB();
      
      alimento = caloriasPadrao.getAlimento(alimentoDieta.getNome());
      
      total = (alimento.getCalorias() * alimentoDieta.getQuantidade()) / 100;
      
      return total;
        
    }
}
