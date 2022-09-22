package javi.dev.tools.brain;

import javi.dev.tools.model.VariableSet;
import javi.dev.tools.service.InfoHandler;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
//@Scope("singleton")
public class InfoEntryPoint {

    private InfoHandler infoHandler;

    public InfoEntryPoint(InfoHandler infoHandler) {
        this.infoHandler = infoHandler;
    }

    public void start(){
        int op=0;
        VariableSet variableSet = new VariableSet();
        do{

            Scanner leer = new Scanner(System.in);
            if(op==0){

                System.out.println("choose 1 or 2 or 3");
                int op2 = Integer.parseInt(leer.nextLine());
                if(op2==1){
                   variableSet = new VariableSet("*",-1);
                }else if(op2==2){
                    variableSet = new VariableSet("#",-3);
                }else{
                    variableSet = new VariableSet("%",49);
                }
                op=-1;
            }
            System.out.println("Your set "+variableSet.toString());
            System.out.println("Actions; 1) concat text, 2) sum a num");
            op=Integer.parseInt(leer.nextLine());
            if(op==1){
                System.out.println("Write your text");
                String text = leer.nextLine();
                infoHandler.ConcatText(variableSet, text);
                op=-1;
            }else if(op==2) {
                System.out.println("Type your number to sum");
                int num = Integer.parseInt(leer.nextLine());
                infoHandler.SumNumeric(variableSet,num);
                op=-1;
            }

        }while (op!=3);
    }
}
