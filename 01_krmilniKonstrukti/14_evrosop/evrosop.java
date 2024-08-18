
// V trgovini EvroŠop® so vsi izdelki naprodaj za 1 evro. Vsaka stranka kupi samo po en
// izdelek, plača pa ga bodisi s kovancem za 1 evro ali pa s kovancem za 2 evra. V prvem
// primeru blagajničarka stranki seveda ne vrne ničesar (saj izdelek stane 1 evro), v drugem
// pa ji vrne kovanec za 1 evro. Blagajna je na začetku prazna.
// Napišite program, ki prebere zaporedje podatkov o tem, s katerim kovancem je posamezna
// stranka plačala izdelek, nato pa izpiše končno število kovancev v blagajni. Lahko se zgodi,
// da blagajničarka stranki, ki je izdelek plačala s kovancem za 2 evra, ne more vrniti kovanca
// za 1 evro, ker jih v blagajni preprosto ni. V tem primeru naj se program zaključi z izpisom
// BANKROT.

import java.util.*;

public class evrosop {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);   
    
    int steviloIkovancev = 0;
    int steviloIIkovancev = 0;

    while (sc.hasNextInt()) {
        int naslednjiKovanec = sc.nextInt();
        if (naslednjiKovanec == 1) {
            steviloIkovancev++;
        } else {
            steviloIIkovancev++;
            steviloIkovancev--;
        }
        if (steviloIkovancev < 0) {
            System.out.println("BANKROT");
            System.exit(0);
        }
    }

    System.out.println(steviloIkovancev);
    System.out.println(steviloIIkovancev);




    }
}
