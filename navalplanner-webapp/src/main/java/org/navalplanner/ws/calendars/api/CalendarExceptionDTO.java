/*
 * This file is part of NavalPlan
 *
 * Copyright (C) 2009 Fundación para o Fomento da Calidade Industrial e
 *                    Desenvolvemento Tecnolóxico de Galicia
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.navalplanner.ws.calendars.api;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;

import org.navalplanner.business.calendars.entities.CalendarException;
import org.navalplanner.ws.common.api.IntegrationEntityDTO;

/**
 * DTO for {@link CalendarException} entity.
 *
 * @author Manuel Rego Casasnovas <mrego@igalia.com>
 */
public class CalendarExceptionDTO extends IntegrationEntityDTO {

    public final static String ENTITY_TYPE = "calendar-exception";

    @XmlAttribute
    public Date date;

    @XmlAttribute
    public Integer hours;

    @XmlAttribute(name = "calendar-exception-type-name")
    public String calendarExceptionTypeName;

    public CalendarExceptionDTO() {
    }

    public CalendarExceptionDTO(String code, Date date, Integer hours,
            String calendarExceptionTypeName) {
        super(code);
        this.date = date;
        this.hours = hours;
        this.calendarExceptionTypeName = calendarExceptionTypeName;
    }

    public CalendarExceptionDTO(Date date, Integer hours,
            String calendarExceptionTypeName) {
        this(generateCode(), date, hours, calendarExceptionTypeName);
    }

    @Override
    public String getEntityType() {
        return ENTITY_TYPE;
    }

}
