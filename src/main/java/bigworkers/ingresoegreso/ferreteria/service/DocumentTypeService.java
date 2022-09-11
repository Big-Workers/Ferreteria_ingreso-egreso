package bigworkers.ingresoegreso.ferreteria.service;

import bigworkers.ingresoegreso.ferreteria.entity.DocumentType;
import bigworkers.ingresoegreso.ferreteria.repository.IDocumentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DocumentTypeService implements IDocumentTypeService{

    @Autowired
    private IDocumentTypeRepository DocumentTypeRepository;
    @Override
    public DocumentType findById(long id) {
        Optional<DocumentType> tipoDocumento = DocumentTypeRepository.findById(id);
        return tipoDocumento.get();
    }

    @Override
    public List<DocumentType> findAll() {
        List<DocumentType> tiposDocumentos = (List<DocumentType>) DocumentTypeRepository.findAll();
        return tiposDocumentos;
    }

    @Override
    public DocumentType createDocumentType(DocumentType tipoDocumento) {
        DocumentType newtipoDocumento = DocumentTypeRepository.save(tipoDocumento);
        return newtipoDocumento;
    }

    @Override
    public DocumentType updateDocumentType(long id, DocumentType tipoDocumento) {
        DocumentType putDocumentType = DocumentTypeRepository.save(tipoDocumento);
        return putDocumentType;
    }

    @Override
    public void deleteDocumentType(long id) {
        DocumentTypeRepository.deleteById(id);
    }
}
