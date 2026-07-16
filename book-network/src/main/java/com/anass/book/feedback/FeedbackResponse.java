package com.anass.book.feedback;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FeedbackResponse {

    private Integer note;
    private String comment;
    private boolean ownFeedback;
}
