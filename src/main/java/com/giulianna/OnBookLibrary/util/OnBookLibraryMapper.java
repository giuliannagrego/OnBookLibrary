package com.giulianna.OnBookLibrary.util;

import com.giulianna.OnBookLibrary.dto.request.OnBookLibraryRequestDTO;
import com.giulianna.OnBookLibrary.dto.response.OnBookLibraryResponseDTO;
import com.giulianna.OnBookLibrary.entity.OnBookLibrary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class OnBookLibraryMapper {

    public OnBookLibrary toOnBookLibrary(OnBookLibraryRequestDTO onBookLibraryDTO) {

        return OnBookLibrary.builder()
                .title(onBookLibraryDTO.getTitle())
                .isbn(onBookLibraryDTO.getIsbn())
                .author(onBookLibraryDTO.getAuthor())
                .build();
    }

    public OnBookLibraryResponseDTO toOnBookLibraryDTO(OnBookLibrary onBookLibrary) {
        return new OnBookLibraryResponseDTO(onBookLibrary);
    }

    public List<OnBookLibraryResponseDTO> toOnBookLibraryDTO(List<OnBookLibrary> onBookLibraryList) {
        return onBookLibraryList.stream().map(OnBookLibraryResponseDTO::new).collect(Collectors.toList());
    }

    public void updateOnBookLibraryData(OnBookLibrary onBookLibrary, OnBookLibraryRequestDTO onBookLibraryDTO) {

        onBookLibrary.setTitle(onBookLibraryDTO.getTitle());
        onBookLibrary.setIsbn(onBookLibraryDTO.getIsbn());
        onBookLibrary.setAuthor(onBookLibraryDTO.getAuthor());

    }
}
