package com.icd.survey.api.entity.survey;

import com.icd.survey.api.entity.survey.dto.ItemAnswerOptionDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Getter
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor
@Table(name = "item_response_option")
public class ItemAnswerOption {
    @Id
    @Column(name = "option_seq", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long optionSeq;

    @Column(name = "option", nullable = false)
    private String option;

    @Column(name = "item_seq")
    private Long itemSeq;


    public void itemKeySet(Long itemSeq){
        this.itemSeq = itemSeq;
    }
    public static ItemAnswerOption createItemResponseOptionRequest(ItemAnswerOptionDto dto) {
        ItemAnswerOption itemResponseOption = new ItemAnswerOption();
        itemResponseOption.itemSeq = dto.getItemSeq();
        itemResponseOption.option = dto.getOption();
        return itemResponseOption;
    }

    public ItemAnswerOptionDto of() {
        return ItemAnswerOptionDto
                .builder()
                .optionSeq(this.optionSeq)
                .option(this.option)
                .build();
    }

}
