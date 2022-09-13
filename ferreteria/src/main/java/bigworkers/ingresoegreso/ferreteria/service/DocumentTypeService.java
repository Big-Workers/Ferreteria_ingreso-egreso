package bigworkers.ingresoegreso.ferreteria.service;

import bigworkers.ingresoegreso.ferreteria.entities.DocumentType;
import bigworkers.ingresoegreso.ferreteria.repository.IDocumentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class DocumentTypeService implements IDocumentTypeService{

    @Autowired
    private IDocumentTypeRepository documentTypeRepository;

    @Override
    public DocumentType findById(int id) {
        Optional<DocumentType> tipoDocumento = documentTypeRepository.findById((long)id);
        return tipoDocumento.get();
    }

    @Override
    public List<DocumentType> findAll() {
        List<DocumentType> tiposDocumentos = (List<DocumentType>) documentTypeRepository.findAll();
        return tiposDocumentos;
    }

    @Override
    public DocumentType createDocumentType(DocumentType tipoDocumento) {
        DocumentType newTipoDocumento = documentTypeRepository.save(tipoDocumento);
        return newTipoDocumento;
    }

    @Override
    public DocumentType updateDocumentType(int id, DocumentType tipoDocumento) {
        DocumentType putTipoDocumento = documentTypeRepository.save(tipoDocumento);
        return putTipoDocumento;
    }

    @Override
    public void deleteDocumentType(int id) {
        documentTypeRepository.deleteById((long)id);
    }
}