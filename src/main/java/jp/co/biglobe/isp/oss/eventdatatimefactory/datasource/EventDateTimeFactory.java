package jp.co.biglobe.isp.oss.eventdatatimefactory.datasource;

import java.time.LocalDateTime;

/**
 * EventDateTimeの生成
 *
 * データソース層からのみの利用を想定
 */
public interface EventDateTimeFactory {
    LocalDateTime getLocalDateTime();
}
