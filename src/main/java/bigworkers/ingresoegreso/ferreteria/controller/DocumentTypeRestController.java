package bigworkers.ingresoegreso.ferreteria.controller;

import bigworkers.ingresoegreso.ferreteria.entities.DocumentType;
import bigworkers.ingresoegreso.ferreteria.service.IDocumentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DocumentTypeRestController {

    @Autowired
    private IDocumentTypeService documentTypeService;

    @GetMapping("/documentType/{id}")
    public DocumentType findById(@PathVariable long id){
        return documentTypeService.findById(id);
    }

    @GetMapping("/documentType")
    public List<DocumentType> findAll(){
        return documentTypeService.findAll();
    }

    @PostMapping("/documentType")
    public DocumentType createDocumentType(@RequestBody DocumentType tipoDocumento){
        return documentTypeService.createDocumentType(tipoDocumento);
    }

    @PatchMapping("/documentType/{id}")
    public DocumentType updateDocumentType(@PathVariable long id, @RequestBody DocumentType tipoDocumento){
        return documentTypeService.updateDocumentType(id,tipoDocumento);
    }

    @DeleteMapping("/documentType/{id}")
    public void deleteDocumentType(@PathVariable long id){
        documentTypeService.deleteDocumentType(id);
    }
}
