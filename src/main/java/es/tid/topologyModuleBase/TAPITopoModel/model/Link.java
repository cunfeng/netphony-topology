/*
 * tapi-topology API
 * tapi-topology API generated from tapi-topology.yang
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package es.tid.topologyModuleBase.TAPITopoModel.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import es.tid.topologyModuleBase.TAPITopoModel.model.AdminStatePac;
import es.tid.topologyModuleBase.TAPITopoModel.model.LayerProtocolTransitionPac;
import es.tid.topologyModuleBase.TAPITopoModel.model.NameAndValue;
import es.tid.topologyModuleBase.TAPITopoModel.model.ResourceSpec;
import es.tid.topologyModuleBase.TAPITopoModel.model.RiskParameterPac;
import es.tid.topologyModuleBase.TAPITopoModel.model.TransferCapacityPac;
import es.tid.topologyModuleBase.TAPITopoModel.model.TransferCostPac;
import es.tid.topologyModuleBase.TAPITopoModel.model.TransferIntegrityPac;
import es.tid.topologyModuleBase.TAPITopoModel.model.TransferTimingPac;
import es.tid.topologyModuleBase.TAPITopoModel.model.ValidationPac;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * The Link object class models effective adjacency between two or more ForwardingDomains (FD). 
 */
@ApiModel(description = "The Link object class models effective adjacency between two or more ForwardingDomains (FD). ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-03-31T10:56:12.255Z")
public class Link   {
  @JsonProperty("label")
  private List<NameAndValue> label = new ArrayList<NameAndValue>();

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("name")
  private List<NameAndValue> name = new ArrayList<NameAndValue>();

  @JsonProperty("node")
  private List<String> node = new ArrayList<String>();

  @JsonProperty("risk-parameter")
  private RiskParameterPac riskParameter = null;

  /**
   * The directionality of the Link.  Is applicable to simple Links where all LinkEnds are BIDIRECTIONAL (the Link will
   * be BIDIRECTIONAL) or UNIDIRECTIONAL (the Link will be UNIDIRECTIONAL).  Is not present in more complex cases.
   */
  public enum DirectionEnum {
    BIDIRECTIONAL("bidirectional"),
    
    UNIDIRECTIONAL("unidirectional"),
    
    UNDEFINED_OR_UNKNOWN("undefined-or-unknown");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DirectionEnum fromValue(String text) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("direction")
  private DirectionEnum direction = null;

  @JsonProperty("validation")
  private ValidationPac validation = null;

  @JsonProperty("node-edge-point")
  private List<String> nodeEdgePoint = new ArrayList<String>();

  /**
   * Gets or Sets layerProtocolName
   */
  public enum LayerProtocolNameEnum {
    OCH("och"),
    
    ODU("odu"),
    
    ETH("eth"),
    
    MPLS_TP("mpls-tp");

    private String value;

    LayerProtocolNameEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LayerProtocolNameEnum fromValue(String text) {
      for (LayerProtocolNameEnum b : LayerProtocolNameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("layer-protocol-name")
  private List<LayerProtocolNameEnum> layerProtocolName = new ArrayList<LayerProtocolNameEnum>();

  @JsonProperty("transfer-integrity")
  private TransferIntegrityPac transferIntegrity = null;

  @JsonProperty("state")
  private AdminStatePac state = null;

  @JsonProperty("transfer-capacity")
  private TransferCapacityPac transferCapacity = null;

  @JsonProperty("transfer-cost")
  private TransferCostPac transferCost = null;

  @JsonProperty("lp-transition")
  private LayerProtocolTransitionPac lpTransition = null;

  @JsonProperty("transfer-timing")
  private TransferTimingPac transferTiming = null;

  public Link label(List<NameAndValue> label) {
    this.label = label;
    return this;
  }

  public Link addLabelItem(NameAndValue labelItem) {
    this.label.add(labelItem);
    return this;
  }

   /**
   * List of labels.A property of an entity with a value that is not expected to be unique and is allowed to change. A label
   * carries no semantics with respect to the purpose of the entity and has no effect on the entity behavior or state.
   * @return label
  **/
  @JsonProperty("label")
  @ApiModelProperty(value = "List of labels.A property of an entity with a value that is not expected to be unique and is"
  		+ "allowed to change. A label carries no semantics with respect to the purpose of the entity and has no effect on"
  		+ "the entity behavior or state.")
  public List<NameAndValue> getLabel() {
    return label;
  }

  public void setLabel(List<NameAndValue> label) {
    this.label = label;
  }

  public Link uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally
   * unique, and immutable. An UUID carries no semantics with respect to the purpose or state of the entity. UUID here uses
   * string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.
   * Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12} 
   * Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6
   * @return uuid
  **/
  @JsonProperty("uuid")
  @ApiModelProperty(value = "UUID: An identifier that is universally unique within an identifier space, where the identifier"
  		+ "space is itself globally unique, and immutable. An UUID carries no semantics with respect to the purpose or state"
  		+ "of the entity. UUID here uses string representation as defined in RFC 4122.  The canonical representation uses"
  		+ "lowercase characters. Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12} "
  		+ "Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Link name(List<NameAndValue> name) {
    this.name = name;
    return this;
  }

  public Link addNameItem(NameAndValue nameItem) {
    this.name.add(nameItem);
    return this;
  }

   /**
   * List of names. A property of an entity with a value that is unique in some namespace but may change during the life
   * of the entity. A name carries no semantics with respect to the purpose of the entity.
   * @return name
  **/
  @JsonProperty("name")
  @ApiModelProperty(value = "List of names. A property of an entity with a value that is unique in some namespacebut may"
  		+ "change during the life of the entity. A name carries no semantics with respect to the purpose of the entity.")
  public List<NameAndValue> getName() {
    return name;
  }

  public void setName(List<NameAndValue> name) {
    this.name = name;
  }

  public Link node(List<String> node) {
    this.node = node;
    return this;
  }

  public Link addNodeItem(String nodeItem) {
    this.node.add(nodeItem);
    return this;
  }

   /**
   * Get node
   * @return node
  **/
  @JsonProperty("node")
  @ApiModelProperty(value = "")
  public List<String> getNode() {
    return node;
  }

  public void setNode(List<String> node) {
    this.node = node;
  }

  public Link riskParameter(RiskParameterPac riskParameter) {
    this.riskParameter = riskParameter;
    return this;
  }

   /**
   * Get riskParameter
   * @return riskParameter
  **/
  @JsonProperty("risk-parameter")
  @ApiModelProperty(value = "")
  public RiskParameterPac getRiskParameter() {
    return riskParameter;
  }

  public void setRiskParameter(RiskParameterPac riskParameter) {
    this.riskParameter = riskParameter;
  }

  public Link direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * The directionality of the Link.  Is applicable to simple Links where all LinkEnds are BIDIRECTIONAL (the Link will
   * be BIDIRECTIONAL) or UNIDIRECTIONAL (the Link will be UNIDIRECTIONAL).  Is not present in more complex cases.
   * @return direction
  **/
  @JsonProperty("direction")
  @ApiModelProperty(value = "The directionality of the Link.  Is applicable to simple Links where all LinkEnds are"
  		+ "BIDIRECTIONAL (the Link will be BIDIRECTIONAL) or UNIDIRECTIONAL (the Link will be UNIDIRECTIONAL)."
  		+ "Is not present in more complex cases.")
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  public Link validation(ValidationPac validation) {
    this.validation = validation;
    return this;
  }

   /**
   * Get validation
   * @return validation
  **/
  @JsonProperty("validation")
  @ApiModelProperty(value = "")
  public ValidationPac getValidation() {
    return validation;
  }

  public void setValidation(ValidationPac validation) {
    this.validation = validation;
  }

  public Link nodeEdgePoint(List<String> nodeEdgePoint) {
    this.nodeEdgePoint = nodeEdgePoint;
    return this;
  }

  public Link addNodeEdgePointItem(String nodeEdgePointItem) {
    this.nodeEdgePoint.add(nodeEdgePointItem);
    return this;
  }

   /**
   * Get nodeEdgePoint
   * @return nodeEdgePoint
  **/
  @JsonProperty("node-edge-point")
  @ApiModelProperty(value = "")
  public List<String> getNodeEdgePoint() {
    return nodeEdgePoint;
  }

  public void setNodeEdgePoint(List<String> nodeEdgePoint) {
    this.nodeEdgePoint = nodeEdgePoint;
  }

  public Link layerProtocolName(List<LayerProtocolNameEnum> layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
    return this;
  }

  public Link addLayerProtocolNameItem(LayerProtocolNameEnum layerProtocolNameItem) {
    this.layerProtocolName.add(layerProtocolNameItem);
    return this;
  }

   /**
   * Get layerProtocolName
   * @return layerProtocolName
  **/
  @JsonProperty("layer-protocol-name")
  @ApiModelProperty(value = "")
  public List<LayerProtocolNameEnum> getLayerProtocolName() {
    return layerProtocolName;
  }

  public void setLayerProtocolName(List<LayerProtocolNameEnum> layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
  }

  public Link transferIntegrity(TransferIntegrityPac transferIntegrity) {
    this.transferIntegrity = transferIntegrity;
    return this;
  }

   /**
   * Get transferIntegrity
   * @return transferIntegrity
  **/
  @JsonProperty("transfer-integrity")
  @ApiModelProperty(value = "")
  public TransferIntegrityPac getTransferIntegrity() {
    return transferIntegrity;
  }

  public void setTransferIntegrity(TransferIntegrityPac transferIntegrity) {
    this.transferIntegrity = transferIntegrity;
  }

  public Link state(AdminStatePac state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @JsonProperty("state")
  @ApiModelProperty(value = "")
  public AdminStatePac getState() {
    return state;
  }

  public void setState(AdminStatePac state) {
    this.state = state;
  }

  public Link transferCapacity(TransferCapacityPac transferCapacity) {
    this.transferCapacity = transferCapacity;
    return this;
  }

   /**
   * Get transferCapacity
   * @return transferCapacity
  **/
  @JsonProperty("transfer-capacity")
  @ApiModelProperty(value = "")
  public TransferCapacityPac getTransferCapacity() {
    return transferCapacity;
  }

  public void setTransferCapacity(TransferCapacityPac transferCapacity) {
    this.transferCapacity = transferCapacity;
  }

  public Link transferCost(TransferCostPac transferCost) {
    this.transferCost = transferCost;
    return this;
  }

   /**
   * Get transferCost
   * @return transferCost
  **/
  @JsonProperty("transfer-cost")
  @ApiModelProperty(value = "")
  public TransferCostPac getTransferCost() {
    return transferCost;
  }

  public void setTransferCost(TransferCostPac transferCost) {
    this.transferCost = transferCost;
  }

  public Link lpTransition(LayerProtocolTransitionPac lpTransition) {
    this.lpTransition = lpTransition;
    return this;
  }

   /**
   * Get lpTransition
   * @return lpTransition
  **/
  @JsonProperty("lp-transition")
  @ApiModelProperty(value = "")
  public LayerProtocolTransitionPac getLpTransition() {
    return lpTransition;
  }

  public void setLpTransition(LayerProtocolTransitionPac lpTransition) {
    this.lpTransition = lpTransition;
  }

  public Link transferTiming(TransferTimingPac transferTiming) {
    this.transferTiming = transferTiming;
    return this;
  }

   /**
   * Get transferTiming
   * @return transferTiming
  **/
  @JsonProperty("transfer-timing")
  @ApiModelProperty(value = "")
  public TransferTimingPac getTransferTiming() {
    return transferTiming;
  }

  public void setTransferTiming(TransferTimingPac transferTiming) {
    this.transferTiming = transferTiming;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link link = (Link) o;
    return Objects.equals(this.label, link.label) &&
        Objects.equals(this.uuid, link.uuid) &&
        Objects.equals(this.name, link.name) &&
        Objects.equals(this.node, link.node) &&
        Objects.equals(this.riskParameter, link.riskParameter) &&
        Objects.equals(this.direction, link.direction) &&
        Objects.equals(this.validation, link.validation) &&
        Objects.equals(this.nodeEdgePoint, link.nodeEdgePoint) &&
        Objects.equals(this.layerProtocolName, link.layerProtocolName) &&
        Objects.equals(this.transferIntegrity, link.transferIntegrity) &&
        Objects.equals(this.state, link.state) &&
        Objects.equals(this.transferCapacity, link.transferCapacity) &&
        Objects.equals(this.transferCost, link.transferCost) &&
        Objects.equals(this.lpTransition, link.lpTransition) &&
        Objects.equals(this.transferTiming, link.transferTiming);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, uuid, name, node, riskParameter, direction, validation, nodeEdgePoint, layerProtocolName, transferIntegrity, state, transferCapacity, transferCost, lpTransition, transferTiming);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
    sb.append("    riskParameter: ").append(toIndentedString(riskParameter)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    nodeEdgePoint: ").append(toIndentedString(nodeEdgePoint)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    transferIntegrity: ").append(toIndentedString(transferIntegrity)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    transferCapacity: ").append(toIndentedString(transferCapacity)).append("\n");
    sb.append("    transferCost: ").append(toIndentedString(transferCost)).append("\n");
    sb.append("    lpTransition: ").append(toIndentedString(lpTransition)).append("\n");
    sb.append("    transferTiming: ").append(toIndentedString(transferTiming)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

