package com.giulianna.OnBookLibrary.service;

import com.giulianna.OnBookLibrary.dto.request.OnBookLibraryRequestDTO;
import com.giulianna.OnBookLibrary.dto.response.OnBookLibraryResponseDTO;

import java.util.List;

public interface OnBookLibraryService {

    OnBookLibraryResponseDTO findById(Long id);

    List<OnBookLibraryResponseDTO> findAll();

    OnBookLibraryResponseDTO register(OnBookLibraryRequestDTO onBookLibraryDTO);

    OnBookLibraryResponseDTO update(OnBookLibraryRequestDTO onBookLibraryDTO, Long id);

    String delete(Long id);
}
