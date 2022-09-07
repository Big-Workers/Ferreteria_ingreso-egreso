package bigworkers.ingresoegreso.ferreteria.service;

import bigworkers.ingresoegreso.ferreteria.entity.DocumentType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DocumentTypeService implements IDocumentTypeService{

    @Override
    public DocumentType findById(long id) {
        DocumentType tipoDocumento = new DocumentType();
        tipoDocumento.setIdDocumentType(1);
        tipoDocumento.setDescription("Cedula de ciudadania");
        tipoDocumento.setInitials("CC");
        tipoDocumento.setState(true);
        return tipoDocumento;
    }

    @Override
    public List<DocumentType> findAll() {
        List<DocumentType> documentos = new ArrayList<>();
        DocumentType tipoDocumento = new DocumentType();
        tipoDocumento.setIdDocumentType(1);
        tipoDocumento.setDescription("Cedula de Ciudadania");
        tipoDocumento.setInitials("CC");
        tipoDocumento.setState(true);
        documentos.add(tipoDocumento);
        DocumentType tipoDocumento2 = new DocumentType();
        tipoDocumento2.setIdDocumentType(2);
        tipoDocumento2.setDescription("Tarjeta de Identidad");
        tipoDocumento2.setInitials("TI");
        tipoDocumento2.setState(true);
        documentos.add(tipoDocumento2);
        return documentos;
    }

    @Override
    public DocumentType createDocumentType(DocumentType tipoDocumento) {
        DocumentType newtipoDocumento = new DocumentType();
        newtipoDocumento.setIdDocumentType(1);
        newtipoDocumento.setDescription(tipoDocumento.getDescription());
        newtipoDocumento.setInitials(tipoDocumento.getInitials());
        newtipoDocumento.setState(tipoDocumento.isState());
        return newtipoDocumento;
    }

    @Override
    public DocumentType updateDocumentType(long id, DocumentType tipoDocumento) {
        DocumentType newtipoDocumento = findById(id);
        newtipoDocumento.setDescription(tipoDocumento.getDescription());
        newtipoDocumento.setInitials(tipoDocumento.getInitials());
        newtipoDocumento.setState(tipoDocumento.isState());
        return newtipoDocumento;
    }

    @Override
    public void deleteDocumentType(long id) {
        DocumentType deleteDocumentType = findById(id);
    }
}
