package com.company;

import java.io.File;
import java.io.FileInputStream;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;

public class Main {
    public static void main(String[] args) throws Exception {


        File file = new File("C:\\Users\\srichter\\OneDrive - Liebensteiner Kartonagenwerk GmbH\\Dokumente\\PDFReadandPrint");
        String printername = "Microsoft Print To PDF";
        new Main().printPdf(file, printername);
        System.out.println("Fertig");
    }

    public void printPdf(File file, String printername) throws Exception{
        DocFlavor flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
        PrintService[] services = PrintServiceLookup.lookupPrintServices(flavor, null);
        FileInputStream psStream = new FileInputStream(file);

        if (services.length > 0)
        {
            PrintService myService = null;
            for(PrintService service : services) {
                System.out.println(service.getName());
                if(service.getName().contains(printername)) {
                    myService = service;
                    break;
                }
            }
            if(myService==null)
                System.out.println("Printer not found");
            else{
                DocPrintJob printJob = myService.createPrintJob();
                Doc document = new SimpleDoc(psStream, flavor, null);
                printJob.print(document, null);
            }
        }
        else
        {
            System.out.println("No PDF printer available.");
        }
    }
}