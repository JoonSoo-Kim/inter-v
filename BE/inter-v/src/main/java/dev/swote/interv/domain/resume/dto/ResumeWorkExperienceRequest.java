// ResumeWorkExperienceRequest.java - ID 필드 추가
package dev.swote.interv.domain.resume.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "경력 사항 요청")
public class ResumeWorkExperienceRequest {

    @Schema(
            description = "경력 ID (수정시에만 사용, 신규 생성시에는 null)",
            example = "1"
    )
    private Integer id;

    @NotBlank(message = "회사명은 필수입니다")
    @Size(max = 100, message = "회사명은 100자 이하로 입력해주세요")
    @Schema(description = "회사명", example = "(주)테크스타트업", required = true)
    private String companyName;

    @NotBlank(message = "직책은 필수입니다")
    @Size(max = 100, message = "직책은 100자 이하로 입력해주세요")
    @Schema(description = "직책/직급", example = "백엔드 개발자", required = true)
    private String position;

    @Size(max = 100, message = "부서명은 100자 이하로 입력해주세요")
    @Schema(description = "부서명", example = "개발팀")
    private String department;

    @Size(max = 100, message = "근무지는 100자 이하로 입력해주세요")
    @Schema(description = "근무지", example = "서울특별시 강남구")
    private String location;

    @Schema(description = "입사일", example = "2021-03-01")
    private LocalDate startDate;

    @Schema(description = "퇴사일", example = "2023-12-31")
    private LocalDate endDate;

    @Schema(description = "현재 재직 중 여부", example = "false")
    private Boolean currentlyWorking;

    @Size(max = 2000, message = "담당업무는 2000자 이하로 입력해주세요")
    @Schema(description = "담당업무", example = "Spring Boot 기반 RESTful API 개발")
    private String responsibilities;

    @Size(max = 2000, message = "성과는 2000자 이하로 입력해주세요")
    @Schema(description = "주요 성과", example = "기존 시스템 대비 API 응답시간 30% 개선")
    private String achievements;
}