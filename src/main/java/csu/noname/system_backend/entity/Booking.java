package csu.noname.system_backend.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.github.jeffreyning.mybatisplus.anno.MppMultiId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serial;
import java.util.Date;
import java.io.Serializable;

/**
 * (Booking)实体类
 *
 * @author makejava
 * @since 2024-07-12 10:55:47
 */
@Data
@Entity
@TableName(value = "booking")
@ApiModel(value = "教室预定")
public class Booking implements Serializable {
    @Serial
    private static final long serialVersionUID = 529123792757513359L;
    @Id
    @TableField(value = "book_id")
    @ApiModelProperty(value = "预定号码")
    private Integer bookId;
    @TableField(value = "booking_site")
    @ApiModelProperty(value = "预约楼栋")
    private String bookingSite;
    @TableField(value = "booking_classroomno")
    @ApiModelProperty(value = "预约教室")
    private Integer bookingClassroomNo;
    @TableField(value = "booking_start_time")
    @ApiModelProperty(value = "预约起始时间")
    private Date bookingStartTime;
    @TableField(value = "booking_start_date")
    @ApiModelProperty(value = "预约日期")
    private Date bookingStartDate;
    @TableField(value = "booked_by")
    @ApiModelProperty(value = "预约人")
    private Long bookedBy;

}

