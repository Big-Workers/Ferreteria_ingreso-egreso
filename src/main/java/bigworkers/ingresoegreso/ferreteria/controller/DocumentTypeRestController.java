package bigworkers.ingresoegreso.ferreteria.controller;

import bigworkers.ingresoegreso.ferreteria.entity.DocumentType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DocumentTypeRestController {

    @GetMapping("/documentType/{idDocumentType}")
    public DocumentType findById(@PathVariable long idDocumentType){
        DocumentType documentType = new DocumentType();
        documentType.setIdDocumentType(idDocumentType);
        documentType.setDescription("cedula de ciudadania");
        documentType.setInitials("CC");
        documentType.setState(true);
        return documentType;
    }

    @GetMapping("/documentType")
    public List<DocumentType> findAll(){
        List<DocumentType> document = new ArrayList<DocumentType>();
        DocumentType document1 = new DocumentType();
        document1.setIdDocumentType(1);
        document1.setDescription("cedula de ciudadania");
        document1.setInitials("CC");
        document1.setState(true);
        DocumentType document2 = new DocumentType();
        document2.setIdDocumentType(2);
        document2.setDescription("cedula de ciudadania");
        document2.setInitials("CC");
        document2.setState(true);
        return document;
    }

    @PostMapping("/documentType")
    public DocumentType CreateDocumentType(@RequestBody DocumentType documentType){
        DocumentType newDocumentType = new DocumentType();
        newDocumentType.setIdDocumentType(3);
        newDocumentType.setDescription(documentType.getDescription());
        newDocumentType.setInitials(documentType.getInitials());
        newDocumentType.setState(documentType.isState());
        return newDocumentType;
    }

    @PutMapping("/documentType/{idDocumentType}")
    public DocumentType updateDocumentType(@PathVariable long idDocumentType, @RequestBody DocumentType documentType){
        DocumentType putDocumentType = findById(idDocumentType);
        putDocumentType.setIdDocumentType(idDocumentType);
        putDocumentType.setDescription(documentType.getDescription());
        putDocumentType.setInitials(documentType.getInitials());
        putDocumentType.setState(documentType.isState());
        return putDocumentType;
    }

    @DeleteMapping("/documentType/{idDocumentType}")
    public  void deleteDocumentType(@PathVariable long idDocumentType){
        DocumentType deleteDocumentType = findById(idDocumentType);
    }


}
